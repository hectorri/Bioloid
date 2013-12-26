#include "Robot.h"
#include "Dynamixel.h"
#include <Arduino-compatibles.h>
Robot bioloid;

/*
 * Inicialización
 */
void setup() {
  bioloid.init();
  SerialUSB.begin();
}

/*
 * Programa
 */
void loop() {

}
