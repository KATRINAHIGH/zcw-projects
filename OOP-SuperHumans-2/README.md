# Humans and Superhumans

### Objectives

1. To demonstrate your understanding of objects and functions
2. To demonstrate your understanding of controlling execution
3. To demonstrate your understanding of access control
4. To demonstrate your understanding of reusing classes


### Overview

Complete the 'Human' class in the Superpowers Package that has fields for: 
name, age, gender, phonenumber, email, occupation, and address. 
Also create methods for retrieving and outputting this data to screen.

Then create a SuperHuman class and UNIT TEST that subclasses the Human with fields 
for good or bad, hero name, super ability. As before, create methods for 
retrieving field data and printing to screen.

NOW, choose a few and create a several subclasses for famous SuperHumans:
Batman
Superman
WonderWoman
She-Hulk
Ayo
Aneka
BuzzLightyear

Extra points for your additions here.

extend SuperHuman to add special attributes that each one might have, (e.g)
Batman might have vehicles of Batmobile and Batcopter. Also add [whimsical](https://en.wikipedia.org/wiki/List_of_superhuman_features_and_abilities_in_fiction) ideas
about weapons, or special mental powers as you see fit.

Show how classes and subclasses work in this hierarchy.

For each subclass implement an interface or two:
```Java
interface XRayVision {
    boolean seesThruWalls();
}
interface Weapons {
    String[] favoriteWeapons();
    boolean hasLaser();
    boolean canShootWebs();
}
interface AerialAptitude {
    boolean canFly();
    boolean canFlyThruSpace();
}
```

feel free to "extends" any of these interfaces
to accomodate a particular superhuman. (Or even add
one of your own.)


Make a UML sketch of your classes and interfaces.
Be prepared to walk thru your classes via explanations.

### Test Instructions

1. In your unit test initialize a human and superhuman instances
2. Demonstrate calling methods inherited from Human on your SuperHuman instances
3. you do not need to extensively exercise your classes, the idea
here is to have more expertise on classes, subclasses and 
interfaces on those various classes.

### ExtraPoints 

Feel free to let your imagination roam a bit. Clever
and interesting additions are most welcome.

Extra points for any intermediate classes that make sense,
gender difference does not. (eg WonderWoman extends Woman - nopety)
