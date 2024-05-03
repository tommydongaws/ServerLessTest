const openvpnmanager = require('node-openvpn');

const opts = {
  host: '127.0.0.1',
  port: 443,
  timeout: 1500, //timeout for connection - optional, will default to 1500ms if undefined
  logpath: 'log.txt' //optional write openvpn console output to file, can be relative path or absolute
};
const auth = {
  user: 'tom',
  pass: 'tomthetester123',
};
const openvpn = openvpnmanager.connect(opts)


 openvpn.on('connected', () => {
   console.log("Connected to VPN successfully...");
 });
