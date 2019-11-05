tomization for entering command prompt
# special characters:
# \h  the hostname up to the first .
# \n  newline
# s   the name of the shell
# \t  the current time in 24-hour format
# \u  the username of the current user
# \w  the current working directory
# \W  the basename of the current working directory
#####################################################################
PS1="\[$(tput setaf 26)\]\t ";                 # time set to orange
PS1+="\[$(tput setaf 160)\]- \W ";              # directory set to yellow
PS1+="\[$(tput setaf 70)\]::::: ";              # prompt set to green
PS1+="\[$(tput sgr0)\]";
export PS1;


#####################################################################
# adding color to terminal using 'tput' command substition '$()'
# command for adding color    $(tput setaf 166) - "166 = orange color"
# command for stopping color  $(tput sgr0)

