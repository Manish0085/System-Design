package DecoratorDesignPattern;

public class StarPower extends CharacterDecorator{
    public StarPower(ICharacter ch) {
        super(ch);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + " with Star Power";
    }
}
