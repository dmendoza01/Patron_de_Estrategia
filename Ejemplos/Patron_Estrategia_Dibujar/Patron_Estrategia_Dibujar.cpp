#include <iostream>

using namespace std;

class StrategyInterface{
    public:
        virtual void execute() = 0;
};

//Interfaz Concreta A
class ConcreteStrategyA: public StrategyInterface{
    public:
        virtual void execute(){
            cout << "Called ConcreteStrategyA execute method" << endl;
        }
};

//Interfaz Concreta B
class ConcreteStrategyB: public StrategyInterface{
    public:
        virtual void execute(){
            cout << "Called ConcreteStrategyB execute method" << endl;
        }
};

//Interfaz Concreta C
class ConcreteStrategyC: public StrategyInterface{
    public:
        virtual void execute(){
            cout << "Called ConcreteStrategyC execute method" << endl;
        }
};

//Clase que Utilizara la Estrategia
class Context{
    private:
        StrategyInterface *_strategy;
    
    public:
        Context(StrategyInterface *strategy):_strategy(strategy){
            //**
        }

        void set_strategy(StrategyInterface *strategy){
            _strategy = strategy;
        }

        void execute(){
            _strategy->execute();
        }
};


int main(int argc, char *argv[]){
    system("color 0b");
    system("cls");

    //Declara ClasesConcreta A, B, C
    ConcreteStrategyA concreteStrategyA;    //Atacar
    ConcreteStrategyB concreteStrategyB;    //Defender
    ConcreteStrategyC concreteStrategyC;    //Contragolpe

    //Declara Contextos
    Context contextA(&concreteStrategyA);   //Estadio A Estrategia Atacar
    Context contextB(&concreteStrategyB);   //Estadio B Estrategia Defender
    Context contextC(&concreteStrategyC);   //Estadio C Estrategia Contragolpe

    contextA.execute();
    contextB.execute();
    contextC.execute();

    cout<<endl;
    
    contextA.set_strategy(&concreteStrategyB);  //Estadio A Estrategia Defender
    contextA.execute();

    cout<<endl;

    contextA.set_strategy(&concreteStrategyC);  //Estadio A Estrategia Contragolpe
    contextA.execute();

    cout<<endl;

    contextC.set_strategy(&concreteStrategyA);  //Estadio C Estrategia Atacar
    contextC.execute();

    cout<<endl<<endl;
    return 0;
}