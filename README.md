# CXO Pulsing and Nudging app MVP Document
# Dreycey Albin


## Abstract

Outline in this document is the overall design, implementation and outcome for the sped up app deliverable for the CXO USAF team by Dreycey Albin. The overall goal was to come up with a phone app (or other) to implement a survey-like pulsing and nudging as a method to increase unit cohesiveness in the United State Air Force. Likewise, another goal that came about was the idea of digital literacy becoming a vulnerability to safety. This app implements both a training module for digital literacy, as well as modules for performing daily “pulsing” and “nudging”.

Youtube Demo: https://www.youtube.com/watch?v=u1uqe72Xjgk
Github: https://github.com/Dreycey/CXO-USAFSpring2021
Contact: dral3008@colorado.edu

## Introduction

The primary goal for the app was to allow for people to link to surveys using a simple app interface. This allows users to pull out their phone and click a button to be sent to the app. The initial goal was to use a Qualtrics interface for this feature, but due to some technical difficulties and timing, it was decided that the best option may be to use a different service. Having a survey service allows for team members not on the app development team to edit the surveys while people working on the app can do development simultaneously (Figure 1A). 

In addition to developing a pulse and nudge module for the application, it would be even better to also have a digital literacy button, thereby completing all of the requests from the leadership team. Instead of performing monitoring of what people are doing on social media, the idea here is to design a training service that happens daily along with the pulsing and nudging. That way it works as part of the daily routine, wake up, look at daily digital literacy tip, then take DigiTest (for assessing digital literacy knowledge), do a daily pulse and nudge. Altogether this would take about 10 minutes and could be part of a morning routine for example (Figure 1B). 


 
**Figure 1- A) Shown here is the overall idea outlined for creating a method for having pulsing and nudging in an android app. B) The next steps for the app would be to have a method for digital literacy training. Here is an illustration for what was proposed.**


## Implementation


Android studio was used for used for creating the application and all of the code was developed and versioned using github. The pulsing module of the application uses a button and a simple yet inviting user interface. Here the user clicks on the button and this takes the user to a survey monkey survey where they can fill out the pulse. This set up is amenable to changes as it allows non-development team members to change the questions in real time using survey monkey without having to recompile the application. Likewise, all of the data collected can be downloaded to a csv file and further analysis can happen offline (Figure 2A). 

Nudging is set up the same way as pulsing. Here the nudging is used to enforce behavior using suggestive questioning. These questions are also listed on survey monkey which allows for changing the questions online so that the app immediately links to the survey. These are also amenable to changes, so leadership or people designing questions can change them whenever they feel the urge (Figure 2B). 

 
**Figure 2 - A) The outline of how the Pulsing module works on the app. B) Outline of how the Nudging module works on the app.**

Digital literacy is also part of the app. This came about in the second version of the app and is focused on giving a set of training material to units so they may avoid common pitfalls of the digital age. It is becoming increasingly important to have military personal that are trained in basic digital literacy, so the app also performs this task using the digital literacy module (Figure 3). Within the digital literacy module, users can open four different links for training. The DigiLearn link opens up to a daily tip for digital literacy, and these daily tips are followed up by a daily quick test using the DigiTest feature. The DigiTest links to a survey monkey survey where the user can test their knowledge of the digital literacy test of the day, as well as overall knowledge regarding digital literacy training. In addition to daily training material, there is also a link to a video training on digital literacy as well as a manual for digital literacy training. When users first open up the app they will be directed to the Digital literacy training manual where they can set the foundation for what they should know regarding digital literacy. 

 
**Figure 3 - Outline of the digital literacy module including all of the subcomponents.**

## Conclusion

As the future of psychological analysis and treatment begin to create new methods for gaining an understanding of team emotion, technology will play a vital role in ensuring it’s success. Here an app for rapidly assessing mood and encouraging behavior was developed. Likewise, this app also aims to ameliorate the negative impacts of the digital era by delivering a prototyped digital literacy training module for equipping units with knowledge of digital literacy rather than using more invasive methods of digital monitoring. 
![image](https://user-images.githubusercontent.com/33699024/113363753-effb9680-930e-11eb-9401-15cc09f5f0b7.png)
