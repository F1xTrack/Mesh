package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: T6 */
/* loaded from: classes.dex */
public abstract class AbstractC1202T6 {
    /* renamed from: a */
    public static boolean m7546a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC7171xy c9196e41;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c9196e41 = new C9196e41(clipData, 3);
            } else {
                C7234yy c7234yy = new C7234yy();
                c7234yy.f46552b = clipData;
                c7234yy.f46553c = 3;
                c9196e41 = c7234yy;
            }
            AbstractC10944rk1.m24478j(textView, c9196e41.mo17858a());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m7547b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC7171xy c9196e41;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c9196e41 = new C9196e41(clipData, 3);
        } else {
            C7234yy c7234yy = new C7234yy();
            c7234yy.f46552b = clipData;
            c7234yy.f46553c = 3;
            c9196e41 = c7234yy;
        }
        AbstractC10944rk1.m24478j(view, c9196e41.mo17858a());
        return true;
    }
}
