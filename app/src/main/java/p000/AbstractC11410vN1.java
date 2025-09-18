package p000;

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
public abstract class AbstractC11410vN1 {
    /* renamed from: a */
    public static final Map m25406a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        if (!itKeys.hasNext()) {
            return C0842NN.f7735a;
        }
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(new Pair(next, jSONObject.get(next).toString()));
        }
        return AbstractC11077sn0.m24786n(arrayList);
    }

    /* renamed from: b */
    public static void m25407b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }
}
