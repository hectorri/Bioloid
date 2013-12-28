int NUM_ACT = 18; //Number of actuators
int SPEED = 0.2; //Speed
//                 1     2    3    4    5    6    7    8    9   10   11   12   13   14   15   16   17   18  
int TRIM[] = {0,   5,   -5,   0,   0,   0,   0,-165, 160,   0,   5,  10,   0,  10, -10,   -8,  10,  -8,   5}; //Trim

//Pisiciones       1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18
int NP[]  =     {0,512,512,512,512,512,512,512,512,512,512,512,512,512,512,512,512,512,512}; //Neutral positions
int IP[]  =     {0,200,820,254,770,470,550,512,512,512,512,512,512,512,512,512,512,512,512}; //Initial positions
int IPW[]  =    {0,200,820,254,770,470,550,512,512,512,512,412,612,312,712,612,412,512,512}; //Initial positions to walwing

//Balance base
int BALANCE[] =  {0,200,820,254,770,470,550,512,512,512,512,412,612,312,712,612,412,512,512};

//Paso derecho        1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18
int STEPR[][19] = {{0,200,820,254,770,470,550,512,512,512,512,382,612,282,412,412,412,512,512},
                   {0,200,820,254,770,470,550,512,512,512,512,352,612,252,412,412,412,512,512},
                   {0,200,820,254,770,470,550,512,512,512,512,322,612,222,412,412,412,512,512},
                   {0,200,820,254,770,470,550,512,512,512,512,412,612,312,412,612,412,512,512}};

//Paso izquierdo
int STEPL[][19] = {{0,200,820,254,770,470,550,512,512,512,512,412,612,312,712,612,412,512,512},
                     {0,200,820,254,770,470,550,512,512,512,512,412,612,312,712,612,412,512,512},
                     {0,200,820,254,770,470,550,512,512,512,512,412,612,312,712,612,412,512,512}};
