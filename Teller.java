const openvpnmanager = require('node-openvpn');

const opts = {
  host: '147.0.40.145',
  port: 38473,
  timeout: 1500, //timeout for connection - optional, will default to 1500ms if undefined
  logpath: 'log.txt' //optional write openvpn console output to file, can be relative path or absolute
};
const auth = {
  user: '{{add user name}}',
  pass: '9c359ad1ebeec200',
};
const openvpn = openvpnmanager.connect(opts)


 openvpn.on('connected', () => {
   console.log("Connected to VPN successfully...");
 });
