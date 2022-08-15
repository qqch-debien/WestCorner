import Link from "next/link";
import Image from "next/image";
import styles from "../navBar.module.css";

export const TextLogo = () => {
	return (
		<div className={styles.textLogoCountainer} >
			<Link href="/">
				<a className={styles.textLogo}>
					<Image 
						src="/images/wc_txt_logo.jpg"
						alt="text logo"
						height="68px"
						width="113px"
					/>
				</a>
			</Link>
		</div>
	)
}
