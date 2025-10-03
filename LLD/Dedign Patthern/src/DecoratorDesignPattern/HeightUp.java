package DecoratorDesignPattern;

public class HeightUp extends CharacterDecorator{

    public HeightUp(ICharacter ch) {
        super(ch);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + " with HeightUp";
    }
}
