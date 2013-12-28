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
      Dxl.writeWord(i, 30, getTrimmedPosition(i, goal[i]));
      setRobotPosition(i,getTrimmedPosition(i, goal[i]));
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

int Robot::getTrimmedPosition(int id, int position){
  return position + TRIM[id];
}

/*******************************************************************************************
 **********************************    CONTROL    ******************************************
 *******************************************************************************************/

/*
 * Caminar
 */
void Robot::walk(int steps){
  move(IPW, 0.2);
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
  //balance(1, 40, 0.5);
  move(STEPR[0], time);
  move(STEPR[1], time);
  move(STEPR[2], time);
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
void Robot::balance(int dir, int amp, float time){
  int bTemp[NUM_ACT+1];
  for(int i=0; i<=NUM_ACT+1; i++){
    bTemp[i] = BALANCE[i];
  }
  if(dir==1){
    bTemp[9] = bTemp[9]+amp;
    bTemp[10] = bTemp[10]+amp;
    bTemp[17] = bTemp[17]+amp;
    bTemp[18] = bTemp[18]+amp;
    move(bTemp, time);
  }else if(dir == -1){
    bTemp[9] = bTemp[9]-amp;
    bTemp[10] = bTemp[10]-amp;
    bTemp[17] = bTemp[17]-amp;
    bTemp[18] = bTemp[18]-amp;
    move(bTemp, time);
  }else{
    move(IPW, time);
  }
}

/*
 * Separar piernas
 */
void Robot::separate(int amp, float time){
  //TODO:
}


