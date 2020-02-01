# ago_minutes

[![](https://jitpack.io/v/kaju02525/ago_minutes.svg)](https://jitpack.io/#kaju02525/ago_minutes)


```
implementation 'com.github.kaju02525:ago_minutes:1.0.2'
maven { url 'https://jitpack.io' }
```

## Examples:
- 4 days ago
- 15 years ago
- a minute ago
- just now


### With Specific Locale (by language tag):

For specific language usage, use _TimeAgoMessages_:

```java
Locale LocaleBylanguageTag = Locale.forLanguageTag("es"); 
TimeAgoMessages messages = new TimeAgoMessages.Builder().withLocale(LocaleBylanguageTag).build();

String text = TimeAgo.using(timeInMillis, messages);
```

Languages supported: Spanish (es), English (en), German (de), French (fr), Italian (it), Portuguese (pt), Indonesian (id), Czech (cs), Arabic (ar).
