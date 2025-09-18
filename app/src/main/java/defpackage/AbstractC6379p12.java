package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* renamed from: p12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6379p12 {
    public static WritableArray a(Spannable spannable, Layout layout, TextPaint textPaint, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        int i = 0;
        int i2 = 1;
        textPaint2.getTextBounds("T", 0, 1, new Rect());
        double dHeight = (r5.height() / 100.0f) / displayMetrics.density;
        textPaint2.getTextBounds("x", 0, 1, new Rect());
        double dHeight2 = (r5.height() / 100.0f) / displayMetrics.density;
        while (i < layout.getLineCount()) {
            float lineWidth = (spannable.length() <= 0 || spannable.charAt(layout.getLineEnd(i) - i2) != '\n') ? layout.getLineWidth(i) : layout.getLineMax(i);
            layout.getLineBounds(i, new Rect());
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", layout.getLineLeft(i) / displayMetrics.density);
            writableMapCreateMap.putDouble("y", r12.top / displayMetrics.density);
            writableMapCreateMap.putDouble(Snapshot.WIDTH, lineWidth / displayMetrics.density);
            writableMapCreateMap.putDouble(Snapshot.HEIGHT, r12.height() / displayMetrics.density);
            writableMapCreateMap.putDouble("descender", layout.getLineDescent(i) / displayMetrics.density);
            writableMapCreateMap.putDouble("ascender", (-layout.getLineAscent(i)) / displayMetrics.density);
            writableMapCreateMap.putDouble("baseline", layout.getLineBaseline(i) / displayMetrics.density);
            writableMapCreateMap.putDouble("capHeight", dHeight);
            writableMapCreateMap.putDouble("xHeight", dHeight2);
            writableMapCreateMap.putString("text", spannable.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i++;
            i2 = 1;
        }
        return writableArrayCreateArray;
    }

    public static LinkedList b(List list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj == null) {
                throw new ParseException(AbstractC8235ym.g(i, "The X.509 certificate at position ", " must not be null"), 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException(AbstractC8235ym.g(i, "The X.509 certificate at position ", " must be encoded as a Base64 string"), 0);
            }
            linkedList.add(new C0815Kf((String) obj));
        }
        return linkedList;
    }
}
