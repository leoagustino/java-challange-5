class Main {
    public static void main(String[] args) {
      Hero hero = new Hero("Leo Agustino", 21);

  
      hero.player();

      for(int i=1; i<=10;i++){
      hero.walk();
      }

      for(int i=1; i<=6;i++){
        hero.run();
        }

        for(int i=1; i<=30;i++){
            hero.walk();
            }
        for(int i=1; i<=3;i++){
            hero.eat();
        }

        for(int i=1; i<=2;i++){
            hero.drink();
        }

        for(int i=1; i<=6;i++){
            hero.jump();
        }

        for(int i=1; i<=5;i++){
            hero.sit();
        }

        for(int i=1; i<=2;i++){
            hero.attack();
        }
        hero.player();

    //   hero.walk();
    //   hero.walk();
    //   hero.walk();
    //   hero.run();
    //   hero.run();
    //   hero.run();
  
      
  
     // hero.player();
  
   //Group 9: walk 10x, run 6x, walk 30x, eat 3x, drink 2x, jump 6x, sit 5x, attack 2x
    }
  }