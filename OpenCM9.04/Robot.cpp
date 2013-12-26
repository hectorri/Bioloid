#include "Robot.h"
#include "Global.h"
#include "Dynamixel.h"
#include <Arduino-compatibles.h>

Dynamixel Dxl(1);

/*
 * Inicio
 */
void Robot::init(){ 
  Dxl.begin(1);
  for(int i=1; i<19; i++){   
    Dxl.writeWord(i, 32, 200);   //Velocidad fija para servos (no hay referencia).
    Dxl.writeWord(i, 30, IP[i]+TRIM[i]);  //Posicionamiento del servo i en posicion[i].
    setRobotPosition(i,IP[i]); //guardamos la posicion como posicion actual.
  }
  delay(3000);
}

/*
 * Ejecuta el movimiento
 */
void Robot::move(int goal[], float time){
  for(int i=1; i<19; i++){  
    if(getRobotPosition(i)!=goal[i]){ 
      Dxl.writeWord(i, 32,(abs(getRobotPosition(i)-goal[i])/time)*0.7);
      Dxl.writeWord(i, 30, goal[i]+TRIM[i]);
      setRobotPosition(i,goal[i]);
    }
  }
  delay(time*500);
}

/*
 * Obtiene la posición del actuador
 */
void Robot::setRobotPosition(int id, int position){
  rp[id]=position;
}

/*
 * Establece la posición del actuador
 */
int Robot::getRobotPosition(int id){
  return rp[id];
}

/*******************************************************************************************
 **********************************    CONTROL    ******************************************
 *******************************************************************************************/

/*
 * Caminar
 */
void Robot::walk(int steps){
  for(int i=0;i<steps;i++){
    //TODO
  }
}

/*
 * Correr
 */
void Robot::run(int steps){
  for(int i=0;i<steps;i++){
    //TODO
  }
}

/*
 * Primer paso
 */
void Robot::firstStep(float time){
  //TODO:
}

/*
 * Ultimo paso
 */
void Robot::lastStep(float time){
  //TODO:
}

/*
 * Paso derecho
 */
void Robot::stepRight(float time){
  //TODO:
}

/*
 * Paso izquierdo
 */
void Robot::stepLeft(float time){
  //TODO:
}

/*
 * Giro derecha
 */
void Robot::turnRight(float time){
  //TODO:
}

/*
 * Giro izquierda
 */
void Robot::turnLeft(float time){
  //TODO:
}

/*
 * Rectificar pasos
 */
void Robot::rectify(){
  //TODO: Implementar sensores
}

/*
 * Balancear
 */
void Robot::balance(int amp, int dir, float time){
  //TODO:
}

/*
 * Separar piernas
 */
void Robot::separate(int amp, float time){
  //TODO:
}


