package defpackage;

import android.media.ExifInterface;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class O02 {
    public static WritableNativeMap a(String str) {
        Float fE;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList(Arrays.asList("FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"));
        arrayList.addAll(new ArrayList(Arrays.asList("DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal")));
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            String attribute = exifInterface.getAttribute("GPSLatitude");
            String attribute2 = exifInterface.getAttribute("GPSLatitudeRef");
            String attribute3 = exifInterface.getAttribute("GPSLongitude");
            String attribute4 = exifInterface.getAttribute("GPSLongitudeRef");
            Float fE2 = null;
            if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
                fE = null;
            } else {
                fE2 = attribute2.equals("N") ? D12.e(attribute) : Float.valueOf(0.0f - D12.e(attribute).floatValue());
                fE = attribute4.equals("E") ? D12.e(attribute3) : Float.valueOf(0.0f - D12.e(attribute3).floatValue());
            }
            if (fE2 != null && fE != null) {
                writableNativeMap.putDouble("Latitude", fE2.floatValue());
                writableNativeMap.putDouble("Longitude", fE.floatValue());
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

    public static final void b(View view, InterfaceC0903Li0 interfaceC0903Li0) {
        O90.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0903Li0);
    }
}
