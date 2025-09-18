package defpackage;

import android.view.ActionMode;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fH0 */
/* loaded from: classes2.dex */
public final class C3742fH0 implements ValueCallback {
    public final /* synthetic */ MenuItem a;
    public final /* synthetic */ WritableMap b;
    public final /* synthetic */ ActionMode c;
    public final /* synthetic */ C3933gH0 d;

    public C3742fH0(C3933gH0 c3933gH0, MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
        this.d = c3933gH0;
        this.a = menuItem;
        this.b = writableMap;
        this.c = actionMode;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) throws JSONException {
        String string;
        String str = (String) obj;
        C3933gH0 c3933gH0 = this.d;
        Map map = (Map) c3933gH0.b.n.get(this.a.getItemId());
        String str2 = (String) map.get("label");
        WritableMap writableMap = this.b;
        writableMap.putString("label", str2);
        writableMap.putString("key", (String) map.get("key"));
        try {
            string = new JSONObject(str).getString("selection");
        } catch (JSONException unused) {
            string = "";
        }
        writableMap.putString("selectedText", string);
        C4315iH0 c4315iH0 = c3933gH0.b;
        c4315iH0.a(c4315iH0, new C3622ef(C7191tH0.a(c4315iH0), writableMap, 8));
        this.c.finish();
    }
}
