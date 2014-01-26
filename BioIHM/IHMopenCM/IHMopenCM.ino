#include "configuration.h"

char val; // Data received from the serial port
char command[21] = "";
int integrityCheck;
int ledPin = BOARD_LED_PIN; // Set the pin to digital I/O 13

void setup() {
  pinMode(ledPin, OUTPUT); // Set pin as OUTPUT
  SerialUSB.begin(); // Start serial communication at 9600 bps
}

void loop() {
  if(SerialUSB.available()){ // If data is available to read,
    val = SerialUSB.read(); // read it and store it in val
    if(val == '['){//Inicio comando
      integrityCheck = 0;
      command[integrityCheck]=val;
    }else if (val == ']' && integrityCheck == PACKET_SIZE-2){//Fin comando
      command[integrityCheck+1]=val;
      processData(command);
    }else{
      //Almacenamos comando
      integrityCheck++;
      command[integrityCheck]=val;
    }
  }
  delay(10); // Wait 10 milliseconds for next reading
}

void processData(char *packet){
  SerialUSB.print("Procesando comando: ");
  for(int i=0; i<PACKET_SIZE; i++){
    SerialUSB.print(packet[i]);
  }
  SerialUSB.println("");
  
  char bufferOpCode[5] = {packet[1], packet[2], packet[3], packet[4], '\0'};
  char bufferDxlId[5] = {packet[6], packet[7], packet[8], packet[9], '\0'};
  char bufferGoalPosition[5] = {packet[11], packet[12], packet[13], packet[14], '\0'};
  char bufferGoalSpeed[5] = {packet[16], packet[17], packet[18], packet[19], '\0'};
  
  int opCode = atoi(bufferOpCode);
  int dxlId = atoi(bufferDxlId);
  int goalPosition = atoi(bufferGoalPosition);
  int goalSpeed = atoi(bufferGoalSpeed);
  
  SerialUSB.println(opCode);
  SerialUSB.println(dxlId);
  SerialUSB.println(goalPosition);
  SerialUSB.println(goalSpeed);
  
  switch(opCode){
    case 0: //Obtener todo
      break;
    case 1: //Obtener 1
      break;
    case 2: //Establecer estado
      break;
    default:
      break;
  }
}

