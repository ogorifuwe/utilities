# customzing settings from both .bash_profile and .bashrc from this file
if [ -f ~/.bashrc ]; then
      source ~/.bashrc
      fi


# Setting PATH for Python 3.6
# The original version is saved in .bash_profile.pysave
PATH="/Library/Frameworks/Python.framework/Versions/3.6/bin:${PATH}"
export PATH

# added by Anaconda3 4.4.0 installer
export PATH="/Users/oi/anaconda3/bin:$PATH"


# Setting PATH for Android Studio
# added by OI on Mon Jan 15 2018 @ 12:59 AM
#export ANDROID_HOME=/Users/oi/Library/Android/sdk
#export PATH=${PATH}:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
# updated settings on Wed Feb 20 2019 @ 22:39
export ANDROID_HOME=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/platform-tools

# PATH settings for HOMEBREW
export PATH=/usr/local/bin:$PATH


# PATH settings for Java
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home
#export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
export PATH=$JAVA_HOME/bin:$PATH
# PATH Settings for Java 10
#export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-10.0.2.jdk/Contents/Home
#export PATH=$JAVA_HOME/bin:$PATH

# PATH settings for JUnit
export JUNIT_HOME=/Library/JUNIT/
export CLASSPATH=$CLASSPATH:$JUNIT_HOME/junit-4.10.jar:.

# Apache Ant
export PATH=$PATH:/User/oi/Development/ant/bin

# MySQL
export PATH="/usr/local/mysql/bin:$PATH"

# resolving android studio emulator problem
function emulator { cd "$(emulator64-x86"$(which emulator)")" && ./emulator "$@"; }


# set default editor for REACT debuggin (March, 24 2019 20:49)
export REACT_EDITOR=atom


# rabbit mq settings
export PATH=$PATH:/usr/local/opt/rabbitmq/sbin


