package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class T6 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC8081xy c3513e41;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c3513e41 = new C3513e41(clipData, 3);
            } else {
                C8271yy c8271yy = new C8271yy();
                c8271yy.b = clipData;
                c8271yy.c = 3;
                c3513e41 = c8271yy;
            }
            AbstractC6897rk1.j(textView, c3513e41.a());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC8081xy c3513e41;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c3513e41 = new C3513e41(clipData, 3);
        } else {
            C8271yy c8271yy = new C8271yy();
            c8271yy.b = clipData;
            c8271yy.c = 3;
            c3513e41 = c8271yy;
        }
        AbstractC6897rk1.j(view, c3513e41.a());
        return true;
    }
}
