package p000;

import android.media.ExifInterface;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class O02 {
    /* renamed from: a */
    public static WritableNativeMap m5926a(String str) {
        Float fM1498e;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList(Arrays.asList("FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"));
        arrayList.addAll(new ArrayList(Arrays.asList("DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal")));
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            String attribute = exifInterface.getAttribute("GPSLatitude");
            String attribute2 = exifInterface.getAttribute("GPSLatitudeRef");
            String attribute3 = exifInterface.getAttribute("GPSLongitude");
            String attribute4 = exifInterface.getAttribute("GPSLongitudeRef");
            Float fM1498e2 = null;
            if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
                fM1498e = null;
            } else {
                fM1498e2 = attribute2.equals("N") ? D12.m1498e(attribute) : Float.valueOf(0.0f - D12.m1498e(attribute).floatValue());
                fM1498e = attribute4.equals("E") ? D12.m1498e(attribute3) : Float.valueOf(0.0f - D12.m1498e(attribute3).floatValue());
            }
            if (fM1498e2 != null && fM1498e != null) {
                writableNativeMap.putDouble("Latitude", fM1498e2.floatValue());
                writableNativeMap.putDouble("Longitude", fM1498e.floatValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    /* renamed from: b */
    public static final void m5927b(View view, InterfaceC7902Li0 interfaceC7902Li0) {
        O90.m5968f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC7902Li0);
    }
}
