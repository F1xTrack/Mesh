package com.my.tracker.obfuscated;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes2.dex */
public final class b0 {
    private a0 a;

    public static final class a {
        static final int a = a() ? 1 : 0;

        /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
        
            r0 = java.util.Locale.US;
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + android.os.Process.myPid() + "/mounts")));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        
            r0 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
        
            if (r4 == null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
        
            if (r5 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        
            if (r4.contains(r0[r5]) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
        
            if (r5 != null) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        
            if (r5 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean a() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.b0.a.a():boolean");
        }
    }

    private static Point b(Context context) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            y2.a("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|(2:142|65)|(2:138|66)|(3:134|67|68)|148|80|81|(3:128|84|85)|88|(2:124|89)|(15:91|122|92|93|116|100|101|136|104|105|126|108|109|112|113)(12:98|116|100|101|136|104|105|126|108|109|112|113)) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(3:(5:120|9|(1:21)(3:13|114|14)|146|22)|140|42)|(2:24|25)(1:29)|26|144|34|35|132|38|39|(12:44|130|45|(1:47)(1:50)|51|52|53|58|(1:60)(1:61)|150|62|(18:64|142|65|138|66|134|67|68|148|80|81|128|84|85|88|124|89|(15:91|122|92|93|116|100|101|136|104|105|126|108|109|112|113)(12:98|116|100|101|136|104|105|126|108|109|112|113))(12:77|78|148|80|81|128|84|85|88|124|89|(0)(0)))(6:56|58|(0)(0)|150|62|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:8|(5:120|9|(1:21)(3:13|114|14)|146|22)|(2:24|25)(1:29)|26|144|34|35|132|38|39|140|42|(12:44|130|45|(1:47)(1:50)|51|52|53|58|(1:60)(1:61)|150|62|(18:64|142|65|138|66|134|67|68|148|80|81|128|84|85|88|124|89|(15:91|122|92|93|116|100|101|136|104|105|126|108|109|112|113)(12:98|116|100|101|136|104|105|126|108|109|112|113))(12:77|78|148|80|81|128|84|85|88|124|89|(0)(0)))(6:56|58|(0)(0)|150|62|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:91|(2:122|92)|93|(2:116|100)|101|136|104|105|126|108|109|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0196, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0197, code lost:
    
        com.my.tracker.obfuscated.y2.a("DeviceParamsDataProvider: collecting touchscreen info exception: ", r0);
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ad, code lost:
    
        com.my.tracker.obfuscated.y2.a("DeviceParamsDataProvider: collecting ui mode info exception: ", r0);
        r33 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        com.my.tracker.obfuscated.y2.a("DeviceParamsDataProvider: collecting packageName exception: ", r0);
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        com.my.tracker.obfuscated.y2.a("DeviceParamsDataProvider: collecting app lang exception: ", r0);
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        com.my.tracker.obfuscated.y2.a("DeviceParamsDataProvider: collecting timezone exception: ", r0);
        r24 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #13 {all -> 0x00ba, blocks: (B:42:0x009b, B:44:0x00a1), top: B:140:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #18 {all -> 0x00ff, blocks: (B:62:0x00da, B:64:0x00e4), top: B:150:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #5 {all -> 0x016a, blocks: (B:89:0x0157, B:91:0x015d), top: B:124:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016e  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.my.tracker.obfuscated.a0 a(android.content.Context r35) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.b0.a(android.content.Context):com.my.tracker.obfuscated.a0");
    }
}
