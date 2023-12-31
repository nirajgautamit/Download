[
  {
    "ProfileName": "IDOR_parameters",
    "Name": "",
    "Enabled": false,
    "Scanner": 3,
    "Author": "@burpbounty",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,All parameters name,.*id$",
      "true,Or,All parameters name,^user$",
      "true,Or,All parameters name,^account$",
      "true,Or,All parameters name,^number$",
      "true,Or,All parameters name,^order$",
      "true,Or,All parameters name,^no$",
      "true,Or,All parameters name,^doc$",
      "true,Or,All parameters name,^key$",
      "true,Or,All parameters name,^email$",
      "true,Or,All parameters name,^group$",
      "true,Or,All parameters name,^profile$",
      "true,Or,All parameters name,^edit$",
      "true,Or,All parameters name,^report$",
      "true,Or,All parameters name,^username$"
    ],
    "Tags": [
      "All"
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
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "IDOR_parameters",
    "IssueSeverity": "Information",
    "IssueConfidence": "Firm",
    "IssueDetail": "References:\u003cbr/\u003e\u003c/br\u003e\n* https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/Insecure%20Direct%20Object%20References\n\nBased in GF patterns by @1ndianl33t.\u003cbr/\u003e\u003cbr/\u003e\n\nI also add more parameters and regex.\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": true,
    "Scantype": 2,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 0
  }
]