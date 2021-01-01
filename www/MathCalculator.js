var exec = require('cordova/exec');

exports.add = function (arg0, success, error) {
  exec(success, error, 'MathCalculator', 'add', [arg0]);
};

exports.substract = function (arg0, success, error) {
  exec(success, error, 'MathCalculator', 'substract', [arg0]);
};
