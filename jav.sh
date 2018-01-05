javac $1
fileName=$1
size=${#fileName}
size=$(expr $size - 5)
newFile=${fileName:0:size}
java $newFile
