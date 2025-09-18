package defpackage;

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
    public static PT a(AbstractC3987gZ0 abstractC3987gZ0, PT pt) {
        boolean z;
        if (abstractC3987gZ0 == null) {
            return pt;
        }
        PT pt2 = new PT(pt);
        boolean z2 = true;
        if (((List) pt.c).isEmpty() || b(abstractC3987gZ0, 1, 2)) {
            z = false;
        } else {
            pt2.c(1);
            z = true;
        }
        if (!((List) pt.d).isEmpty() && !b(abstractC3987gZ0, 3)) {
            pt2.c(2);
            z = true;
        }
        if (((List) pt.e).isEmpty() || b(abstractC3987gZ0, 4)) {
            z2 = z;
        } else {
            pt2.c(4);
        }
        if (!z2) {
            return pt;
        }
        List listUnmodifiableList = Collections.unmodifiableList((ArrayList) pt2.c);
        List listUnmodifiableList2 = Collections.unmodifiableList((ArrayList) pt2.d);
        List listUnmodifiableList3 = Collections.unmodifiableList((ArrayList) pt2.e);
        if (listUnmodifiableList.isEmpty() && listUnmodifiableList2.isEmpty() && listUnmodifiableList3.isEmpty()) {
            return null;
        }
        return new PT(pt2, (byte) 0);
    }

    public static boolean b(AbstractC3987gZ0 abstractC3987gZ0, int... iArr) {
        if (abstractC3987gZ0 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return abstractC3987gZ0.f.containsAll(arrayList);
    }

    public static final WritableMap c(C4034gp c4034gp, C8117y81 c8117y81) throws C5837mB0 {
        O90.f(c4034gp, "<this>");
        C5843mD0 previewView$react_native_vision_camera_release = c4034gp.getPreviewView$react_native_vision_camera_release();
        if (previewView$react_native_vision_camera_release == null) {
            throw new C5837mB0("capture", "snapshot-failed-preview-not-enabled", "Failed to take a Snapshot because preview={...} was disabled! Enable preview and try again.", null);
        }
        Bitmap bitmap = previewView$react_native_vision_camera_release.getBitmap();
        if (bitmap == null) {
            throw new C5837mB0("capture", "snapshot-failed", "Failed to take a Snapshot of the Preview View! Try using takePhoto() instead.", null);
        }
        c4034gp.c(A01.c);
        File file = c8117y81.a.d;
        O90.e(file, "<get-file>(...)");
        int i = c8117y81.b;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            AbstractC2141aT1.a(fileOutputStream, null);
            EnumC1106Ny0 enumC1106Ny0B = c4034gp.getCameraSession$react_native_vision_camera_release().m.b();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("path", file.getAbsolutePath());
            writableMapCreateMap.putInt(Snapshot.WIDTH, bitmap.getWidth());
            writableMapCreateMap.putInt(Snapshot.HEIGHT, bitmap.getHeight());
            writableMapCreateMap.putString("orientation", enumC1106Ny0B.a);
            writableMapCreateMap.putBoolean("isMirrored", false);
            return writableMapCreateMap;
        } finally {
        }
    }
}
