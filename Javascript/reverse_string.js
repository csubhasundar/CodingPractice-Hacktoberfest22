function reverseString(string) {
  const splitString = string.split('');
  const reverseString = splitString.reverse();
  const joinArray = reverseString.join('');

  return joinArray;
}

const reverse1 = reverseString('hello world');

console.log(reverse1);
