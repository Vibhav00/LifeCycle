# Lifecycle App 😍🔥🎉

### A simple yet powerful tool to explore the lifecycle of an Activity and Fragment in Android – and to observe how lifecycle-aware observers respond to these events! 📲🔍

---

### Symbols
- 🤠 -> Activity
- 🖼️ -> Fragment
- ❣️ -> Observer


### This The the LogCat Result for the App 


```text
Activity Created  is Called from Main Activity [🤠 ]
Event OnCreate is Called from MainActivity Observer [❣️]

Fragment On Attach  is Called from TestFragment2 [🖼️]
Fragment OnCreate is Called from TestFragment2 [🖼️]
Fragment OnCreateView is Called from TestFragment2 [🖼️]
Fragment OnViewCreated is Called from TestFragment2 [🖼️]

Event OnCreate is Called from TestFragment2 Observer [❣️]

Fragment On Attach  is Called from TestFragment [🖼️]
Fragment OnCreate is Called from TestFragment [🖼️]
Fragment OnCreateView is Called from TestFragment [🖼️]
Fragment OnViewCreated is Called from TestFragment [🖼️]

Event OnCreate is Called from TestFragment Observer [❣️]

Fragment OnViewStateRestored is Called from TestFragment2 [🖼️]
Fragment OnViewStateRestored is Called from TestFragment [🖼️]

Fragment Started is Called from TestFragment2 [🖼️]
Event ON_START is Called from TestFragment2 Observer [❣️]

Fragment Started is Called from TestFragment [🖼️]
Event ON_START is Called from TestFragment Observer [❣️]

Activity Started is Called from Main Activity [🤠]
Event ON_START is Called from MainActivity Observer [❣️]

Activity Resumed is Called from Main Activity [🤠]

Fragment Resumed is Called from TestFragment2 [🖼️]
Event ON_RESUME is Called from TestFragment2 Observer [❣️]

Fragment Resumed is Called from TestFragment [🖼️]
Event ON_RESUME is Called from TestFragment Observer [❣️]

Event ON_RESUME is Called from MainActivity Observer [❣️]

Event ON_PAUSE is Called from MainActivity Observer [❣️]
Event ON_PAUSE is Called from TestFragment Observer [❣️]
Fragment Paused is Called from TestFragment [🖼️]
Event ON_PAUSE is Called from TestFragment2 Observer [❣️]
Fragment Paused is Called from TestFragment2 [🖼️]
Activity Paused is Called from Main Activity [🤠]


Event ON_STOP is Called from MainActivity Observer [❣️]
Event ON_STOP is Called from TestFragment Observer [❣️]
Event ON_STOP is Called from TestFragment2 Observer [❣️]
Fragment Stopped  is Called from TestFragment [🖼️]
Fragment Stopped  is Called from TestFragment2 [🖼️]
Activity Stopped  is Called from Main Activity [🤠]

Fragment OnSaveInstanceState is Called from TestFragment2 [🖼️]
Fragment OnSaveInstanceState is Called from TestFragment [🖼️]

Activity Restarted is Called from Main Activity [🤠]
Fragment Started is Called from TestFragment2 [🖼️]
Event ON_START is Called from TestFragment2 Observer [❣️]
Fragment Started is Called from TestFragment [🖼️]
Event ON_START is Called from TestFragment Observer [❣️]
Activity Started is Called from Main Activity [🤠]
Event ON_START is Called from MainActivity Observer [❣️]
Activity Resumed is Called from Main Activity [🤠]
Fragment Resumed is Called from TestFragment2 [🖼️]
Event ON_RESUME is Called from TestFragment2 Observer [❣️]
Fragment Resumed is Called from TestFragment [🖼️]
Event ON_RESUME is Called from TestFragment Observer [❣️]
Event ON_RESUME is Called from MainActivity Observer [❣️]

Event ON_PAUSE is Called from MainActivity Observer [❣️]
Event ON_PAUSE is Called from TestFragment Observer [❣️]
Fragment Paused is Called from TestFragment [🖼️]
Event ON_PAUSE is Called from TestFragment2 Observer [❣️]
Fragment Paused is Called from TestFragment2 [🖼️]
Activity Paused is Called from Main Activity [🤠]

Event ON_STOP is Called from MainActivity Observer [❣️]
Event ON_STOP is Called from TestFragment Observer [❣️]
Event ON_STOP is Called from TestFragment2 Observer [❣️]
Fragment Stopped  is Called from TestFragment [🖼️]
Fragment Stopped  is Called from TestFragment2 [🖼️]
Activity Stopped  is Called from Main Activity [🤠]

Event ON_DESTROY is Called from MainActivity Observer [❣️]
Activity Destroyed  is Called from Main Activity [🤠]
Fragment View Destroyed  is Called from TestFragment [🖼️]
Fragment View Destroyed  is Called from TestFragment2 [🖼️]
Event ON_DESTROY is Called from TestFragment Observer [❣️]
Fragment Destroyed  is Called from TestFragment [🖼️]
Fragment On_Detach  is Called from TestFragment [🖼️]
Event ON_DESTROY is Called from TestFragment2 Observer [❣️]
Fragment Destroyed  is Called from TestFragment2 [🖼️]
Fragment On_Detach  is Called from TestFragment2 [🖼️]

```

## About 💡🎯

The Lifecycle App is designed to provide an in-depth understanding of the Android lifecycle for both activities and fragments. It serves as a practical tool for developers to visualize and observe the various states that an activity and its fragments go through during their lifecycle.

In this app, we focus on how the MainActivity interacts with two nested fragments, TestFragment and TestFragment2. Each lifecycle event is carefully logged, allowing users to see how observers react to different lifecycle changes. This includes crucial events like creation, start, resume, pause, stop, and destruction, which are vital for managing resources and ensuring a smooth user experience.

By observing these lifecycle events, developers can gain insights into:

- How to effectively manage UI updates in response to lifecycle changes.
- The importance of using lifecycle-aware components to avoid memory leaks and ensure optimal performance.
- Best practices for handling nested fragments and their interactions with the parent activity.

Whether you're a beginner looking to learn about Android's lifecycle or an experienced developer wanting to refine your understanding, this app provides a comprehensive view of how activities and fragments work together. Dive in and explore the intricacies of the Android lifecycle! 🚀✨
