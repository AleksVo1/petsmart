package ca.petsmart.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPetDialog extends BasePage{

    @FindBy(id = "#upload-photo-button")
    protected WebElement uploadPhotoBtn;

    @FindBy(id = "#pet-name-input")
    protected WebElement petNameField;

    @FindBy(id = "#pet-birthdate-input")
    protected WebElement birthdayField;

    @FindBy(xpath = "//div[@id='pet-species-input']//div[@class='react-select__value-container css-1hwfws3']")
    protected WebElement speciesField;

    @FindBy(xpath = "//div[@id='pet-gender-input']//div[@class='react-select__value-container css-1hwfws3']")
    protected WebElement genderField;

    @FindBy(xpath = "//div[@id='pet-breed-input']//div[@class='react-select__value-container css-1hwfws3']")
    protected WebElement breedField;

    @FindBy(id = "#pet-weight-input")
    protected WebElement weightField;

    @FindBy(id = "#pet-color-input")
    protected WebElement colorField;

    @FindBy(id = "#add-pet-button")
    protected WebElement addPetBtn;

    public AddPetDialog(WebDriver driver) {
        super(driver);
    }

    public void addNewDog(String petName, String weight){
        String photoPath = "/Users/user/IdeaProjects/petsmart/src/main/java/ca/petsmart/images/dog.png";
        uploadPhotoBtn.sendKeys(photoPath);

        petNameField.sendKeys(petName);
        birthdayField.sendKeys("01/01/2018");

        dropDownSelector(speciesField, "Dog");
        dropDownSelector(genderField, "Male - neutered");
        dropDownSelector(breedField, "Akita");
        weightField.sendKeys(weight);
        dropDownSelector(colorField, "Black");

        addPetBtn.click();

    }

    public void addNewCat(String petName, String weight){
        String photoPath = "/Users/user/IdeaProjects/petsmart/src/main/java/ca/petsmart/images/Cat.png";
        uploadPhotoBtn.sendKeys(photoPath);

        petNameField.sendKeys(petName);
        birthdayField.sendKeys("01/01/2018");

        dropDownSelector(speciesField, "Cat");
        dropDownSelector(genderField, "Male - neutered");
        dropDownSelector(breedField, "Akita");
        weightField.sendKeys(weight);
        dropDownSelector(colorField, "Black");

        addPetBtn.click();

    }

}
