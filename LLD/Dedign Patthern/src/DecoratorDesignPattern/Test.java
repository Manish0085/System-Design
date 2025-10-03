package DecoratorDesignPattern;

public class Test {

    public static void main(String[] args) {
        ICharacter mario = new Mario();
        System.out.println("Basic Character: "+mario.getAbilities());

        mario = new HeightUp(mario);
        System.out.println("After HeightUp: "+mario.getAbilities());

        mario = new StarPower(mario);
        System.out.println("After StarPowerUp: " + mario.getAbilities());


        mario = new GunPower(mario);
        System.out.println("After GunPowerUp: " + mario.getAbilities());
    }
}
