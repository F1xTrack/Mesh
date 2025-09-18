package p000;

import android.database.Cursor;
import android.os.Build;
import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes.dex */
public abstract class MY1 {
    /* renamed from: a */
    public static WritableMap[] m5394a(C11438vb1 c11438vb1) {
        MotionEvent motionEvent = c11438vb1.f44441a;
        UN1.m7999c(motionEvent);
        WritableMap[] writableMapArr = new WritableMap[motionEvent.getPointerCount()];
        float x = motionEvent.getX() - c11438vb1.f44444d;
        float y = motionEvent.getY() - c11438vb1.f44445e;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("pageX", AbstractC11406vL1.m25402a(motionEvent.getX(i)));
            writableMapCreateMap.putDouble("pageY", AbstractC11406vL1.m25402a(motionEvent.getY(i)));
            float x2 = motionEvent.getX(i) - x;
            float y2 = motionEvent.getY(i) - y;
            writableMapCreateMap.putDouble("locationX", AbstractC11406vL1.m25402a(x2));
            writableMapCreateMap.putDouble("locationY", AbstractC11406vL1.m25402a(y2));
            writableMapCreateMap.putInt("targetSurface", c11438vb1.getSurfaceId());
            writableMapCreateMap.putInt("target", c11438vb1.getViewTag());
            writableMapCreateMap.putDouble("timestamp", c11438vb1.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEvent.getPointerId(i));
            writableMapArr[i] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    /* renamed from: b */
    public static final int m5395b(Cursor cursor, String str) {
        O90.m5968f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        int i = -1;
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            String[] columnNames = cursor.getColumnNames();
            O90.m5967e(columnNames, "columnNames");
            String strConcat = ".".concat(str);
            String str2 = "." + str + '`';
            int length = columnNames.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str3 = columnNames[i2];
                int i4 = i3 + 1;
                if (str3.length() >= str.length() + 2 && (D51.m1550i(str3, strConcat) || (str3.charAt(0) == '`' && D51.m1550i(str3, str2)))) {
                    i = i3;
                    break;
                }
                i2++;
                i3 = i4;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static final int m5396c(Cursor cursor, String str) {
        String strM4196w;
        O90.m5968f(cursor, "c");
        int iM5395b = m5395b(cursor, str);
        if (iM5395b >= 0) {
            return iM5395b;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            O90.m5967e(columnNames, "c.columnNames");
            strM4196w = AbstractC0576J8.m4196w(columnNames, null, null, null, null, 63);
        } catch (Exception unused) {
            strM4196w = "unknown";
        }
        throw new IllegalArgumentException(AbstractC1374Vq.m8590i("column '", str, "' does not exist. Available columns: ", strM4196w));
    }

    /* renamed from: d */
    public static WritableArray m5397d(boolean z, WritableMap... writableMapArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (WritableMap writableMapCopy : writableMapArr) {
            if (writableMapCopy != null) {
                if (z) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    /* renamed from: e */
    public static void m5398e(RCTEventEmitter rCTEventEmitter, C11438vb1 c11438vb1) {
        EnumC11565wb1 enumC11565wb1 = c11438vb1.f44442b;
        UN1.m7999c(enumC11565wb1);
        WritableArray writableArrayM5397d = m5397d(false, m5394a(c11438vb1));
        MotionEvent motionEvent = c11438vb1.f44441a;
        UN1.m7999c(motionEvent);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (enumC11565wb1 == EnumC11565wb1.f44989e || enumC11565wb1 == EnumC11565wb1.f44990f) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                writableArrayCreateArray.pushInt(i);
            }
        } else {
            if (enumC11565wb1 != EnumC11565wb1.f44987c && enumC11565wb1 != EnumC11565wb1.f44988d) {
                throw new RuntimeException("Unknown touch type: " + enumC11565wb1);
            }
            writableArrayCreateArray.pushInt(motionEvent.getActionIndex());
        }
        EnumC11565wb1.f44986b.getClass();
        rCTEventEmitter.receiveTouches(enumC11565wb1.f44992a, writableArrayM5397d, writableArrayCreateArray);
    }
}
