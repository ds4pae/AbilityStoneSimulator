# AbilityStoneSimulator
"LostArk" 게임내에 존재하는 어빌리티 스톤 세공 시뮬레이터 초안
1. 확률 부분 불확실
2. GUI표현 부분 수정 필요

2023-04-12
고민을 해봤는데 1)부분에서 double을 사용해야한다고 생각했음
왜 Why? 75%라는건 random함수를 사용했을때 74.9999999가 나왔어도 75%가 되지않아 세공에 실패함.
그러나 1 to 100중 1 to 75와 76 to 100으로 봤을때 1 to 75 (75개), 76 to 100 (25개)로 정리된다.
즉, 75%와 25%로 깔끔하게 나누어 떨어짐을 깨달았다. (수정 완료)
