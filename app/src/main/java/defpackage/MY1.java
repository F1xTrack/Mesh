package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes.dex */
public abstract class MY1 {
    public static WritableMap[] a(C7634vb1 c7634vb1) {
        MotionEvent motionEvent = c7634vb1.a;
        UN1.c(motionEvent);
        WritableMap[] writableMapArr = new WritableMap[motionEvent.getPointerCount()];
        float x = motionEvent.getX() - c7634vb1.d;
        float y = motionEvent.getY() - c7634vb1.e;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("pageX", AbstractC7586vL1.a(motionEvent.getX(i)));
            writableMapCreateMap.putDouble("pageY", AbstractC7586vL1.a(motionEvent.getY(i)));
            float x2 = motionEvent.getX(i) - x;
            float y2 = motionEvent.getY(i) - y;
            writableMapCreateMap.putDouble("locationX", AbstractC7586vL1.a(x2));
            writableMapCreateMap.putDouble("locationY", AbstractC7586vL1.a(y2));
            writableMapCreateMap.putInt("targetSurface", c7634vb1.getSurfaceId());
            writableMapCreateMap.putInt("target", c7634vb1.getViewTag());
            writableMapCreateMap.putDouble("timestamp", c7634vb1.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEvent.getPointerId(i));
            writableMapArr[i] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    public static final int b(Cursor cursor, String str) {
        O90.f(cursor, "c");
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
            O90.e(columnNames, "columnNames");
            String strConcat = ".".concat(str);
            String str2 = "." + str + '`';
            int length = columnNames.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str3 = columnNames[i2];
                int i4 = i3 + 1;
                if (str3.length() >= str.length() + 2 && (D51.i(str3, strConcat) || (str3.charAt(0) == '`' && D51.i(str3, str2)))) {
                    i = i3;
                    break;
                }
                i2++;
                i3 = i4;
            }
        }
        return i;
    }

    public static final int c(Cursor cursor, String str) {
        String strW;
        O90.f(cursor, "c");
        int iB = b(cursor, str);
        if (iB >= 0) {
            return iB;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            O90.e(columnNames, "c.columnNames");
            strW = J8.w(columnNames, null, null, null, null, 63);
        } catch (Exception unused) {
            strW = "unknown";
        }
        throw new IllegalArgumentException(AbstractC1705Vq.i("column '", str, "' does not exist. Available columns: ", strW));
    }

    public static WritableArray d(boolean z, WritableMap... writableMapArr) {
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

    public static void e(RCTEventEmitter rCTEventEmitter, C7634vb1 c7634vb1) {
        EnumC7824wb1 enumC7824wb1 = c7634vb1.b;
        UN1.c(enumC7824wb1);
        WritableArray writableArrayD = d(false, a(c7634vb1));
        MotionEvent motionEvent = c7634vb1.a;
        UN1.c(motionEvent);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (enumC7824wb1 == EnumC7824wb1.e || enumC7824wb1 == EnumC7824wb1.f) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                writableArrayCreateArray.pushInt(i);
            }
        } else {
            if (enumC7824wb1 != EnumC7824wb1.c && enumC7824wb1 != EnumC7824wb1.d) {
                throw new RuntimeException("Unknown touch type: " + enumC7824wb1);
            }
            writableArrayCreateArray.pushInt(motionEvent.getActionIndex());
        }
        EnumC7824wb1.b.getClass();
        rCTEventEmitter.receiveTouches(enumC7824wb1.a, writableArrayD, writableArrayCreateArray);
    }
}
