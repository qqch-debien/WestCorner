import Image from "next/image";
import styles from "../navBar.module.css";

export const BurgerLogo = () => {
	return(
		<div className={styles.burgerLogoCountener}>
			<Image className={styles.burgerLogo}
				src="/images/wc_burger_logo.png"
				alt="burger logo"
				width="45"
				height="45"
			/>
		</div>
	);
}
