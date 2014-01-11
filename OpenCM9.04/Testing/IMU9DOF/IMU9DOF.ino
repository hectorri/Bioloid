#include "Wire.h"
#include "I2Cdev.h"
#include "ADXL345.h"
#include "HMC5883L.h"
#include "ITG3200.h"

#define LED_PIN 13

ITG3200 gyro;
ADXL345 accel;
HMC5883L mag;

int16_t mx, my, mz;
int16_t gx, gy, gz;
int16_t ax, ay, az;

bool blinkState = false;

void setup() {
    // Iniciar BUS I2C
    Wire.begin();

    // Iniciar comunicación serie
    Serial.begin(9600);

    // Iniciar IMU
    Serial.println("Inicializando dispositivo...");
    gyro.initialize();
    accel.initialize();
    mag.initialize();

    // Verificar conexión
    Serial.println("Comprobando conexión...");
    Serial.println(gyro.testConnection() ? "ITG3205 OK!" : "ITG3205 ERROR!");
    Serial.println(accel.testConnection() ? "ADXL345 OK!" : "ADXL345 ERROR!");
    Serial.println(mag.testConnection() ? "HMC5883L OK!" : "HMC5883L ERROR!");

    // Led de Arduino para visualizar estado
    pinMode(LED_PIN, OUTPUT);
}

void loop() {
    // Lectura
    gyro.getRotation(&gx, &gy, &gz);
    accel.getAcceleration(&ax, &ay, &az);
    mag.getHeading(&mx, &my, &mz);

    Serial.print("GY: ");
    Serial.print(gx); Serial.print(" ");
    Serial.print(gy); Serial.print(" ");
    Serial.print(az); Serial.print(" ");

    Serial.print("AC: ");
    Serial.print(ax); Serial.print(" ");
    Serial.print(ay); Serial.print(" ");
    Serial.print(az); Serial.print(" ");

    Serial.print("MA: ");
    Serial.print(mx); Serial.print(" ");
    Serial.print(my); Serial.print(" ");
    Serial.print(mz); Serial.print(" ");

    Serial.println();
    delay(300);

    //Parpadeo LED para indicar actividad
    blinkState = !blinkState;
    digitalWrite(LED_PIN, blinkState);
}

