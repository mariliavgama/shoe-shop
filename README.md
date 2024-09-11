# The Shoe Store

This project consists of five screens:

1. Login screen: Email and password fields and labels plus create and login buttons
2. Welcome onboarding screen
3. Instructions onboarding screen
4. Shoe Listing screen
5. Shoe Detail screen for adding a new shoe

## Login destination

   * Email and password labels
   * Email and password fields
   * Buttons for creating a new login and logging in with an existing account
   * Clicking either button navigates to the Welcome Screen.

## Welcome screen destination

   * A new layout
   * Textviews
   * A navigation button with actions to navigate to the instructions screen

## Instruction destination

   * A new layout
   * Textviews
   * A navigation button with actions to navigate to the shoe list screen

## Shoe List destination

   * A new layout
   * A ScrollView
   * A LinearLayout for Shoe Items
   * A FloatingActionButton with an action to navigate to the shoe detail screen
   * A class that extends ViewModel
   * LiveData field that returns the list of shoes
   * Activity level ViewModel to hold a list of Shoes (use by activityViewModels)
   * Observe the shoes variable from the ViewModel
   * Use DataBindingUtil to inflate the shoe_list layout
   * Add a new layout item into the scrollview for each shoe
   * Make sure you can’t go back to onboarding screens

## Shoe Detail destination

    * A new layout
    * A TextView label and EditView for the
      * Shoe Name
      * Company
      * Shoe Size
      * Description
    * A Cancel button with an action to navigate back to the shoe list screen
    * A Save button with an action to navigate back to the shoe list screen and add a new Shoe to the Shoe View Model
    
