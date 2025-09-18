package p000;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NR1 {
    /* renamed from: a */
    public static C0974PT m5688a(AbstractC9513gZ0 abstractC9513gZ0, C0974PT c0974pt) {
        boolean z;
        if (abstractC9513gZ0 == null) {
            return c0974pt;
        }
        C0974PT c0974pt2 = new C0974PT(c0974pt);
        boolean z2 = true;
        if (((List) c0974pt.f9079c).isEmpty() || m5689b(abstractC9513gZ0, 1, 2)) {
            z = false;
        } else {
            c0974pt2.m6370c(1);
            z = true;
        }
        if (!((List) c0974pt.f9080d).isEmpty() && !m5689b(abstractC9513gZ0, 3)) {
            c0974pt2.m6370c(2);
            z = true;
        }
        if (((List) c0974pt.f9081e).isEmpty() || m5689b(abstractC9513gZ0, 4)) {
            z2 = z;
        } else {
            c0974pt2.m6370c(4);
        }
        if (!z2) {
            return c0974pt;
        }
        List listUnmodifiableList = Collections.unmodifiableList((ArrayList) c0974pt2.f9079c);
        List listUnmodifiableList2 = Collections.unmodifiableList((ArrayList) c0974pt2.f9080d);
        List listUnmodifiableList3 = Collections.unmodifiableList((ArrayList) c0974pt2.f9081e);
        if (listUnmodifiableList.isEmpty() && listUnmodifiableList2.isEmpty() && listUnmodifiableList3.isEmpty()) {
            return null;
        }
        return new C0974PT(c0974pt2, (byte) 0);
    }

    /* renamed from: b */
    public static boolean m5689b(AbstractC9513gZ0 abstractC9513gZ0, int... iArr) {
        if (abstractC9513gZ0 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return abstractC9513gZ0.f27847f.containsAll(arrayList);
    }

    /* renamed from: c */
    public static final WritableMap m5690c(C4140gp c4140gp, C11761y81 c11761y81) throws C10233mB0 {
        O90.m5968f(c4140gp, "<this>");
        C10237mD0 previewView$react_native_vision_camera_release = c4140gp.getPreviewView$react_native_vision_camera_release();
        if (previewView$react_native_vision_camera_release == null) {
            throw new C10233mB0("capture", "snapshot-failed-preview-not-enabled", "Failed to take a Snapshot because preview={...} was disabled! Enable preview and try again.", null);
        }
        Bitmap bitmap = previewView$react_native_vision_camera_release.getBitmap();
        if (bitmap == null) {
            throw new C10233mB0("capture", "snapshot-failed", "Failed to take a Snapshot of the Preview View! Try using takePhoto() instead.", null);
        }
        c4140gp.m18650c(A01.f6c);
        File file = c11761y81.f46101a.f28140d;
        O90.m5967e(file, "<get-file>(...)");
        int i = c11761y81.f46102b;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            AbstractC8729aT1.m9749a(fileOutputStream, null);
            EnumC8038Ny0 enumC8038Ny0M26141b = c4140gp.getCameraSession$react_native_vision_camera_release().f6868m.m26141b();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("path", file.getAbsolutePath());
            writableMapCreateMap.putInt(Snapshot.WIDTH, bitmap.getWidth());
            writableMapCreateMap.putInt(Snapshot.HEIGHT, bitmap.getHeight());
            writableMapCreateMap.putString("orientation", enumC8038Ny0M26141b.f8152a);
            writableMapCreateMap.putBoolean("isMirrored", false);
            return writableMapCreateMap;
        } finally {
        }
    }
}
