import Image from "next/image";
import styles from "./navBar.module.css";

export const TextLogo = () => {
	return (
		<div className={styles.textLogoCountainer}>
			<Image 
				src="/images/wc_txt_logo.jpg"
				alt="text logo"
				height="68px"
				width="113px"
			/>
		</div>
	)
}
