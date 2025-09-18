package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.jni.ExpectedType;

/* renamed from: Ud1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1590Ud1 extends AbstractC0818Kg {
    public final /* synthetic */ int c;
    public final /* synthetic */ ExpectedType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1590Ud1(boolean z, ExpectedType expectedType, int i) {
        super(z, 1);
        this.c = i;
        this.d = expectedType;
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        switch (this.c) {
        }
        return this.d;
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object e(Object obj) {
        switch (this.c) {
            case 0:
                O90.f(obj, "value");
                break;
            case 1:
                O90.f(obj, "value");
                break;
            case 2:
                O90.f(obj, "value");
                break;
            case 3:
                O90.f(obj, "value");
                break;
            case 4:
                O90.f(obj, "value");
                break;
            case 5:
                O90.f(obj, "value");
                break;
            case 6:
                O90.f(obj, "value");
                break;
            case 7:
                O90.f(obj, "value");
                break;
            case 8:
                O90.f(obj, "value");
                break;
            case 9:
                O90.f(obj, "value");
                break;
            case 10:
                O90.f(obj, "value");
                break;
            case 11:
                O90.f(obj, "value");
                break;
            case 12:
                O90.f(obj, "value");
                break;
            default:
                O90.f(obj, "value");
                break;
        }
        return obj;
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object f(Dynamic dynamic) throws C1319Qr0 {
        switch (this.c) {
            case 0:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray = dynamic.asArray();
                int size = readableArrayAsArray.size();
                double[] dArr = new double[size];
                for (int i = 0; i < size; i++) {
                    dArr[i] = readableArrayAsArray.getDouble(i);
                }
                return dArr;
            case 1:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray2 = dynamic.asArray();
                int size2 = readableArrayAsArray2.size();
                float[] fArr = new float[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    fArr[i2] = (float) readableArrayAsArray2.getDouble(i2);
                }
                return fArr;
            case 2:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray3 = dynamic.asArray();
                int size3 = readableArrayAsArray3.size();
                boolean[] zArr = new boolean[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    zArr[i3] = readableArrayAsArray3.getBoolean(i3);
                }
                return zArr;
            case 3:
                O90.f(dynamic, "value");
                return Integer.valueOf((int) dynamic.asDouble());
            case 4:
                O90.f(dynamic, "value");
                return Long.valueOf((long) dynamic.asDouble());
            case 5:
                O90.f(dynamic, "value");
                return Double.valueOf(dynamic.asDouble());
            case 6:
                O90.f(dynamic, "value");
                return Float.valueOf((float) dynamic.asDouble());
            case 7:
                O90.f(dynamic, "value");
                return Boolean.valueOf(dynamic.asBoolean());
            case 8:
                O90.f(dynamic, "value");
                return dynamic.asString();
            case 9:
                O90.f(dynamic, "value");
                return dynamic.asArray();
            case 10:
                O90.f(dynamic, "value");
                return dynamic.asMap();
            case 11:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray4 = dynamic.asArray();
                int size4 = readableArrayAsArray4.size();
                int[] iArr = new int[size4];
                for (int i4 = 0; i4 < size4; i4++) {
                    iArr[i4] = readableArrayAsArray4.getInt(i4);
                }
                return iArr;
            case 12:
                O90.f(dynamic, "value");
                throw new C1319Qr0(BP0.a.b(Object.class));
            default:
                O90.f(dynamic, "value");
                throw new C1319Qr0(BP0.a.b(Object.class));
        }
    }
}
