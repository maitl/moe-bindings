package org.moe.binding.googlemobileads.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSValue;
import org.moe.binding.googlemobileads.DFPBannerView;
import org.moe.binding.googlemobileads.GADAdLoader;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GoogleMobileAds")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("DFPBannerAdLoaderDelegate")
public interface DFPBannerAdLoaderDelegate extends GADAdLoaderDelegate {
	@Generated
	@Selector("adLoader:didReceiveDFPBannerView:")
	void adLoaderDidReceiveDFPBannerView(GADAdLoader adLoader,
			DFPBannerView bannerView);

	@Generated
	@Selector("validBannerSizesForAdLoader:")
	NSArray<? extends NSValue> validBannerSizesForAdLoader(GADAdLoader adLoader);
}