# Synchronized
Android   範例Synchronized   https://www.ptt.cc/bbs/AndroidDev/M.1390316957.A.0D4.html


Synchronized.method0();
A:1
B:1
A:2
B:2
A:3
B:3

mSynchronized.method1();
A:1
A:2
A:3
B:1
B:2
B:3

new Synchronized().method1();
A:1
B:1
A:2
B:2
A:3
B:3

new Synchronized().method2();
A:1
A:2
A:3
B:1
B:2
B:3

mSynchronized.method1();
A:1
A:2
A:3
B:1
B:2
B:3
End method3


mSynchronized.method1();
mSynchronized.method3();
Start Thread!
A:1
Start method3
A:2
A:3
B:1
B:2
B:3
End method3
