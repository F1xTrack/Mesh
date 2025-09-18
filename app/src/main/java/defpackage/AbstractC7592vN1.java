package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* renamed from: vN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7592vN1 {
    public static final Map a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        if (!itKeys.hasNext()) {
            return NN.a;
        }
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(new Pair(next, jSONObject.get(next).toString()));
        }
        return AbstractC7096sn0.n(arrayList);
    }

    public static void b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }
}
