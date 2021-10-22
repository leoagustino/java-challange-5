class Main {
    public static void main(String[] args) {
      Hero hero = new Hero("Leo Agustino", 21);

  
      hero.player();

      for(int i=1; i<=7;i++){
      hero.walk();
      }

      for(int i=1; i<=2;i++){
        hero.run();
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
        for(int i=1; i<=10;i++){
            hero.walk();
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
  
   //Group 9: walk 7x, run 2x, eat 3x, drink 2x, jump 6x, sit 5x, walk 10x, attack 2x
    }
  }