# CXO-USAFSpring2021
The repository is focused on the MVP for the Spring class CXO-USAF cohort.
 ## How to crreate basic apps using Java

[This is a nice tutorial I'm using to understand adnroid+java](https://developer.android.com/codelabs/build-your-first-android-app#3)

* need to connect to [website and app feedback](https://www.qualtrics.com/support/website-app-feedback/common-use-cases/mobile-app-feedback-project/)
## How to connect with Qualtris

[This Qualtrics tutorrial goes over connecting qualtrisc to android studio](https://api.qualtrics.com/sdks/docs/SDKs/Mobile%20Android%20Intercept%20SDK/getting-started-with-mobile-app-sdk-on-android.md)

### NOTES

* Went through tutorial but the app is now failing because of the manifest file for android. It is assumed this may be fixed by getting rid of the folliwng lines: 

```
      <activity 
      android:name=
        "com.qualtrics.digital.QualtricsSurveyActivity"/>
      <activity
      android:name=
        "com.qualtrics.digital.QualtricsPopoverActivity" 
      android:theme="@style/Theme.Transparent" />
```

However, these are  needed for the building process. 

* For now, commenting out those lines in the XML

* Using Intercept Logic to Solicit App Reviews
* * This allows people to essentailly trigger when users are presented a survey. For example, this could be used when someone beats a game, or goes through a digital literacy training video. This is done by modifying the `evaluateTargetingLogic()` method in the Qualtrics Singleton class.  
* Using Multiple Intercepts Within Your App
* * This section outlines how to use a button for displaying different interceps for the app at hand. 

## About the Qualtrics singleton class.

[The Qualtrics Singleton](https://api.qualtrics.com/sdks/docs/SDKs/Mobile%20Android%20Intercept%20SDK/app-feedback-android-api-reference-1.md)

### notes


#### Qualtrics Class

##### Fields
* Properties
* * these are objeccts that can be accessed throughout the app. 

##### Methods
* display()
* * displays the creative, can be edited by `evaluateTargetingLogicWithCompletion`
* initialize()
* * this method inits the singleton for the qualtrics class. 
* * This calls the backend using the intercepts. 
* instance() 
* * returns the instances for the instantiated object
* registerViewVisitWithViewName
* * can be used to record visits to aview.
* resetTimer
* * this resets the timer for app
*  resetViewCounter
* * resets the view counter 
* setNotificationIconAsset `Qualtrics.instance().properties.setNotificationIconAsset(`
* * 
* getNotificationIconAsset `Qualtrics.instance().properties.getNotificationIconAsset()`
* * used for setting the icon for qaultrics pop ups 
* removeNotificationIconAsset `Qualtrics.instance().properties.removeNotificationIconAsset();`
* * This removes the icon for pop ups

#### InitializationResult Class

##### 

#####

1. the MIN SDK allowed is 21 when using the qualtrics SDK. Make sure to update this acccordingly so that the gradle build file works. 

## How to uncover user analytics in Qualtrics
[User Analytics](https://api.qualtrics.com/sdks/docs/SDKs/Mobile%20Android%20Intercept%20SDK/user-analytics-with-the-mobile-app-sdk-4.md)

This can be very useful for obtaining click-through rates
