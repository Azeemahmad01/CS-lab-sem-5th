#!/bin/bash
if [ -z "$1" ]; then
    echo "Usage: $0 <directory_path>"
    exit 1 
fi 
if [ ! -d "$1" ]; then
    echo "Error: $1 is not a valid directory."
    exit 1 
for dir in "$1"/*;
  do
      if [-d "$dir"]; then
       entry_Count=$(ls -1 "$dir" | wc -1)
       echo "subdirectory are: $(basename "$dir" - number$
fi 
done

