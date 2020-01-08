# ago_minutes

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
