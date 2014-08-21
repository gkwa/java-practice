cd prefstest/src/main/java
rm -f com/streambox/prefstest/App.class $HOME/Library/Preferences/com.streambox.prefstest.plist /Library/Preferences/com.streambox.prefstest.plist
tree
javac com/streambox/prefstest/App.java
java com.streambox.prefstest.App
cat com/streambox/prefstest/App.java
find /Library/Preferences $HOME/Library/Preferences -type f | grep -i prefstest
/usr/libexec/PlistBuddy -c print $HOME/Library/Preferences/com.streambox.prefstest.plist
