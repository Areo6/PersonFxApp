
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Developer
 */
public class Person {
    
    private StringProperty firstName=new SimpleStringProperty(this,"firstName","");
    private StringProperty middleName=new SimpleStringProperty(this,"middleName","");
    private StringProperty lastName=new SimpleStringProperty(this,"lastName","");
    private StringProperty suffix=new SimpleStringProperty(this,"siffix","");
    private final ObjectProperty<Person.Gender> gender=new SimpleObjectProperty<>(this,"gendrer",Gender.UNKNOWN);
    private StringProperty notes=new SimpleStringProperty(this,"notes","");

    /**
     * @return the firstName
     */
    public StringProperty getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public final StringProperty firstNameProperty(){
        return firstName;
    }
    public StringProperty getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(StringProperty middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public final StringProperty middleNameProperty(){
        return middleName;
    }
    public StringProperty getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(StringProperty lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the suffix
     */
    public StringProperty lastNameProperty(){
        return lastName;
    }
    public StringProperty getSuffix() {
        return suffix;
    }

    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(StringProperty suffix) {
        this.suffix = suffix;
    }

    /**
     * @return the gender
     */
    public final StringProperty suffixProperty(){
        return suffix;
    }
    public ObjectProperty<Person.Gender> getGender() {
        return gender;
    }

    /**
     * @return the notes
     */
    public final ObjectProperty<Person.Gender> genderProperty(){
        return gender;
    }
    public StringProperty getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(StringProperty notes) {
        this.notes = notes;
    }
    public final StringProperty notesProperty(){
        return notes;
    }
    public enum Gender{
        MALE,FEMALE,UNKNOWN;
    }
    
    
}
