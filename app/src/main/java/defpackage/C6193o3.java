package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: o3 */
/* loaded from: classes.dex */
public final class C6193o3 extends C0823Kh1 {
    public final /* synthetic */ int h;
    public final a i;
    public final int[] j;

    public C6193o3(ReadableMap readableMap, a aVar, int i) {
        this.h = i;
        switch (i) {
            case 1:
                this.i = aVar;
                ReadableArray array = readableMap.getArray("input");
                this.j = new int[array.size()];
                int i2 = 0;
                while (true) {
                    int[] iArr = this.j;
                    if (i2 >= iArr.length) {
                        break;
                    } else {
                        iArr[i2] = array.getInt(i2);
                        i2++;
                    }
                }
            case 2:
                this.i = aVar;
                ReadableArray array2 = readableMap.getArray("input");
                this.j = new int[array2.size()];
                int i3 = 0;
                while (true) {
                    int[] iArr2 = this.j;
                    if (i3 >= iArr2.length) {
                        break;
                    } else {
                        iArr2[i3] = array2.getInt(i3);
                        i3++;
                    }
                }
            case 3:
                this.i = aVar;
                ReadableArray array3 = readableMap.getArray("input");
                this.j = new int[array3.size()];
                int i4 = 0;
                while (true) {
                    int[] iArr3 = this.j;
                    if (i4 >= iArr3.length) {
                        break;
                    } else {
                        iArr3[i4] = array3.getInt(i4);
                        i4++;
                    }
                }
            default:
                this.i = aVar;
                ReadableArray array4 = readableMap.getArray("input");
                this.j = new int[array4.size()];
                int i5 = 0;
                while (true) {
                    int[] iArr4 = this.j;
                    if (i5 >= iArr4.length) {
                        break;
                    } else {
                        iArr4[i5] = array4.getInt(i5);
                        i5++;
                    }
                }
        }
    }

    @Override // defpackage.C0823Kh1, defpackage.T4
    public final String c() {
        switch (this.h) {
            case 0:
                StringBuilder sb = new StringBuilder("AdditionAnimatedNode[");
                sb.append(this.d);
                sb.append("]: input nodes: ");
                int[] iArr = this.j;
                sb.append(iArr != null ? iArr.toString() : "null");
                sb.append(" - super: ");
                sb.append(super.c());
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder("DivisionAnimatedNode[");
                sb2.append(this.d);
                sb2.append("]: input nodes: ");
                int[] iArr2 = this.j;
                sb2.append(iArr2 != null ? iArr2.toString() : "null");
                sb2.append(" - super: ");
                sb2.append(super.c());
                return sb2.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder("MultiplicationAnimatedNode[");
                sb3.append(this.d);
                sb3.append("]: input nodes: ");
                int[] iArr3 = this.j;
                sb3.append(iArr3 != null ? iArr3.toString() : "null");
                sb3.append(" - super: ");
                sb3.append(super.c());
                return sb3.toString();
            default:
                StringBuilder sb4 = new StringBuilder("SubtractionAnimatedNode[");
                sb4.append(this.d);
                sb4.append("]: input nodes: ");
                int[] iArr4 = this.j;
                sb4.append(iArr4 != null ? iArr4.toString() : "null");
                sb4.append(" - super: ");
                sb4.append(super.c());
                return sb4.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x00bc, code lost:
    
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + r6.d);
     */
    @Override // defpackage.T4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6193o3.d():void");
    }
}
