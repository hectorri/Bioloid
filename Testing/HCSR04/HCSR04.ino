#define trigPin 13
#define echoPin 12

int timeOut = 3000; //50m Max.

void setup(){
  Serial.begin (9600);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
}

void loop(){
  long time, distance;
  // Inicio
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  // Disparo
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  // Fin de disparo
  digitalWrite(trigPin, LOW);
  // Capturamos retorno
  time = pulseIn(echoPin, HIGH, timeOut);
  // Calculamos distancia
  distance = time/29/2;
  if(time==0 || time==timeOut){
    Serial.println("Fuera de rango");
  }else{
    Serial.print(distance);
    Serial.println(" cm");
  }
  delay(500);
} 
