#ifndef ROBOT_H
#define ROBOT_H

/*
 * Robot
 */
class Robot{
  
  int rp[19]; //Actuators positions
  public:
    void init();
    void move(int[], float);
    void setRobotPosition(int, int);
    int getRobotPosition(int);
    void walk(int);
    void run(int);
    void firstStep(float);
    void lastStep(float);
    void stepRight(float);
    void stepLeft(float);
    void turnRight(float);
    void turnLeft(float);
    void rectify();
    void balance(int, int, float);
    void separate(int, float);
};

#endif

