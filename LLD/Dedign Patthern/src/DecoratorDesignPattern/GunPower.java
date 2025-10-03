package DecoratorDesignPattern;

public class GunPower extends CharacterDecorator{


    public GunPower(ICharacter ch) {
        super(ch);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + " with Gun Power";
    }
}
